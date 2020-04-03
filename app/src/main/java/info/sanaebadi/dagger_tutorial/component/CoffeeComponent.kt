package info.sanaebadi.dagger_tutorial.component

import dagger.Component
import info.sanaebadi.dagger_tutorial.MainActivity
import info.sanaebadi.dagger_tutorial.model.Coffee
import info.sanaebadi.dagger_tutorial.module.CoffeeModule


@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun getCoffee(): Coffee


    fun inject(mainActivity: MainActivity)

    interface Builder{


    }
}