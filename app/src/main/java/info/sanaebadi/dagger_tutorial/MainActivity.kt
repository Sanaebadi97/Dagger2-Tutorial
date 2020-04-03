package info.sanaebadi.dagger_tutorial

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import info.sanaebadi.dagger_tutorial.component.CoffeeComponent
import info.sanaebadi.dagger_tutorial.component.DaggerCoffeeComponent
import info.sanaebadi.dagger_tutorial.model.Coffee
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    lateinit var coffeeComponent: CoffeeComponent

    @Inject
    lateinit var coffee: Coffee

    companion object {
        const val TAG: String = "MainActivity"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           coffeeComponent = DaggerCoffeeComponent.create()
        //coffeeComponent.getCoffee().getCoffeeCup()

        coffeeComponent.inject(this)

        coffee.getCoffeeCup()

        Log.i(TAG, coffee.getCoffeeCup())

    }
}
