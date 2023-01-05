package me.adrianed.mckotlin.velocity

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer

@Plugin(
    id = "mckotlin"
)
class VelocityPlugin @Inject constructor(
    private val proxyServer: ProxyServer
) {
    @Subscribe
    fun onInitialization(event: ProxyInitializeEvent) {

    }
}

