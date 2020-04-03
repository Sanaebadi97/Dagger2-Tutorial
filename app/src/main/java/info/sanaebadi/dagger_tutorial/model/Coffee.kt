package info.sanaebadi.dagger_tutorial.model

import android.util.Log
import info.sanaebadi.dagger_tutorial.annotation.Milk
import info.sanaebadi.dagger_tutorial.annotation.Sugar
import info.sanaebadi.dagger_tutorial.component.CoffeeComponent
import javax.inject.Inject
import javax.inject.Named

class Coffee @Inject constructor(val river: River, val farm: Farm, @Sugar val sugar: Int, @Milk val milk:Int) {


    companion object {
        const val TAG: String = "Coffee"

    }

    fun getCoffeeCup(): String {

        return "${farm.getBeans()} / ${river.getWater()} / $sugar / $milk"
    }


    @Inject
    fun connectElectricity() {
        Log.i(TAG, "Connecting ....")
    }


}