package info.sanaebadi.dagger_tutorial.component

import dagger.Component
import info.sanaebadi.dagger_tutorial.MainActivity
import info.sanaebadi.dagger_tutorial.model.Coffee


@Component
interface CoffeeComponent {
    fun getCoffee(): Coffee


    fun inject(mainActivity: MainActivity)
}