package info.sanaebadi.dagger_tutorial.model

import javax.inject.Inject

class Coffee @Inject constructor( val river: River,  val farm: Farm) {


    fun getCoffeeCup(): String {

        return "${farm.getBeans()} / ${river.getWater()}"
    }


}