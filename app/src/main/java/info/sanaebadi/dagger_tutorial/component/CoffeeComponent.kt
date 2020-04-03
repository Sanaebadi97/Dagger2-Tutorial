package info.sanaebadi.dagger_tutorial.component

import dagger.Component
import info.sanaebadi.dagger_tutorial.model.Coffee


@Component
interface CoffeeComponent {
    fun getCoffee(): Coffee
}