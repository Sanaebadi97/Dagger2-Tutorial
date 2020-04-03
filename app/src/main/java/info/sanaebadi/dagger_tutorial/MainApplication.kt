package info.sanaebadi.dagger_tutorial

import android.app.Application
import info.sanaebadi.dagger_tutorial.component.CoffeeComponent
import info.sanaebadi.dagger_tutorial.component.DaggerCoffeeComponent

class MainApplication : Application() {

    private lateinit var coffeeComponent: CoffeeComponent

    override fun onCreate() {
        super.onCreate()

        coffeeComponent = DaggerCoffeeComponent.builder().sugar(4).milk(8).build()

    }


    fun getCoffeeComponent(): CoffeeComponent {

        return coffeeComponent
    }


}