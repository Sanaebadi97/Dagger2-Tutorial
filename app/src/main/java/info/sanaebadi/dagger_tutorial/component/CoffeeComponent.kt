package info.sanaebadi.dagger_tutorial.component

import dagger.BindsInstance
import dagger.Component
import info.sanaebadi.dagger_tutorial.MainActivity
import info.sanaebadi.dagger_tutorial.model.Coffee
import info.sanaebadi.dagger_tutorial.module.CoffeeModule


@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun getCoffee(): Coffee


    fun inject(mainActivity: MainActivity)


    @Component.Builder
    interface Builder {


        /*

        when use function with same like int , string ... u get  is bound multiple times: error so we use qualifiers
         */

        fun build(): CoffeeComponent

        @BindsInstance
        fun sugar(sugar: Int): Builder


        @BindsInstance
        fun milk(milk: Int): Builder
    }
}