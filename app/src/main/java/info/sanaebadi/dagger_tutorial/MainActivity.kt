package info.sanaebadi.dagger_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.sanaebadi.dagger_tutorial.component.CoffeeComponent
import info.sanaebadi.dagger_tutorial.component.DaggerCoffeeComponent
import info.sanaebadi.dagger_tutorial.model.Coffee
import info.sanaebadi.dagger_tutorial.model.Farm
import info.sanaebadi.dagger_tutorial.model.River

class MainActivity : AppCompatActivity() {


    lateinit var coffeeComponent: CoffeeComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coffeeComponent = DaggerCoffeeComponent.create()
        coffeeComponent.getCoffeeCup()

    }
}
