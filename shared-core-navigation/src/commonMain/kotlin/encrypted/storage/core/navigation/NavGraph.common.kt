package encrypted.storage.core.navigation

import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

sealed interface NavGraph : Parcelable {

    @Parcelize
    object Splash : NavGraph

    @Parcelize
    object Main : NavGraph
}
