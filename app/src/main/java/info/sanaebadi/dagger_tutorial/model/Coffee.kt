package info.sanaebadi.dagger_tutorial.model

import android.util.Log
import info.sanaebadi.dagger_tutorial.component.CoffeeComponent
import javax.inject.Inject
import javax.inject.Named

class Coffee @Inject constructor(val river: River, val farm: Farm, @Named("sugar") val sugar: Int, @Named("milk") val milk:Int) {


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