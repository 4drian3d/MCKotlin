@file:OptIn(InternalCoroutinesApi::class)

package io.github._4drian3d.mckotlin.paper

import kotlinx.coroutines.*
import kotlinx.coroutines.internal.MainDispatcherFactory
import org.bukkit.Bukkit
import kotlin.coroutines.CoroutineContext
import kotlin.math.ceil

class PaperMainDispatcherFactory : MainDispatcherFactory {

    override val loadPriority: Int
        get() = Int.MAX_VALUE / 2

    override fun createDispatcher(allFactories: List<MainDispatcherFactory>): MainCoroutineDispatcher {
        return BukkitSchedulerDispatcher()
    }
}

private val plugin by lazy {
    Bukkit.getPluginManager().getPlugin("MCKotlin-Paper")!!
}

class BukkitSchedulerDispatcher : MainCoroutineDispatcher(), Delay {
    override val immediate: MainCoroutineDispatcher = this

    override fun dispatch(context: CoroutineContext, block: Runnable) {
        Bukkit.getScheduler().runTask(
            plugin,
            Runnable { block.run() }
        )
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    override fun scheduleResumeAfterDelay(timeMillis: Long, continuation: CancellableContinuation<Unit>) {
        Bukkit.getScheduler().runTaskLater(
            plugin,
            Runnable {
                with(continuation) { resumeUndispatched(Unit) }
            },
            timeMillis.millisToTicks()
        )
    }

    private fun Long.millisToTicks(): Long =
        // One Minecraft tick is 50ms,
        // so if millis is not divisible without a remainder,
        // we use the ceiling function to find the next possible tick for execution.
        ceil(this / 50.0).toLong()
}
