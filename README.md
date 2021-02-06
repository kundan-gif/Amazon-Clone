 Dependancies used or the project
 
    // GSON
    implementation 'com.google.code.gson:gson:2.8.6'


    // Glide
    implementation 'com.github.bumptech.glide:glide:4.11.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
    
    //build.gradle(Module) :
    implementation 'com.github.smarteist:autoimageslider:1.4.0'
    
    //Denzcosk github library for Sliding images automatcally
    implementation 'com.github.denzcoskun:ImageSlideshow:0.0.6'
    
    //This is one for the slining images automatically
    allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }

