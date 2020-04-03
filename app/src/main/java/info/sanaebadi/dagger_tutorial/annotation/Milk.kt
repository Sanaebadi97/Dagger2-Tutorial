package info.sanaebadi.dagger_tutorial.annotation

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Milk(
    /** The name.  */
    val value: String = "milk"
)