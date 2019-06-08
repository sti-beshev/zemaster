# Zemaster

This is a JavaFX app for a learning course.

## Setup steps

* Install 'JavaFX Scene Builder'.

For Eclipse:

* Add access rule to the project path of the jre: 'Accessible javafx/**'.
* Install 'e(fx)clipse' plugin.
* Set the 'JavaFX Scene Builder' executable in windows >> Preferences >> JavaFX.
* Add the JavaFX lib to the build path to use JavaFX css.
* Install plugin m2e-apt (for Dagger 2 annotations)
* Select Automatically configure JDT AP in Window >> Preferences >> Maven (for Dagger 2 annotations)


## Other steps

* If you want to create executable jar, use goals: 'clean compile assembly:single'.