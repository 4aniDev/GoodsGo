package ru.chani.goodsgo

import platform.UIKit.UIDevice
import ru.chani.goodsgo.presentation.Platform

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()