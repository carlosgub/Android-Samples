# Android-Samples (Necesita Android 4.1 para ver el preview de Compose)
Ejemplos de algunas implementaciones de Android que estare revisando a lo largo del tiempo

- Fragment Factory (View Pager 1 y FragmentContainerView)
- Android Compose (Dev08)

Android programming with fragments requires the developer to include an empty constructor in the event the operating system needs to reconstruct the fragment on its own. The OS will not use any constructors with arguments when re-instantiating, and so any arguments should be included by passing them in with setArguments(). This will be fixed with Fragment Factory :). (check the references about this)

# References

Fragments
- https://www.youtube.com/watch?v=RS1IACnZLy4
- https://medium.com/@chris.ribetti/android-fragmentfactory-75823af015fd
