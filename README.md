# Svg2AndroidXml

A project that auto convert svg files to android supported vector xml


Background
---
As of Android 5.0 (API level 21), there are two classes that support vector graphics as a drawable resource: VectorDrawable and AnimatedVectorDrawable.

Detail: https://developer.android.com/studio/write/vector-asset-studio.html

Problem
---
Programmer need to convert the svg file to xml everytime if the svg file is changed.

There is no automatically method to convert the svg files to android support xml files.

Solution
---
Convert svg files to xml files automatically by the Android Studio IDE Vector Asset Studio, before the application build process. 

Table of Contents
---
- [Svg2Android](https://github.com/RaysonYeungHK/Svg2AndroidXml/tree/master/Svg2Android)

  Java Project to provide the service to convert svg files to xml files, JRE1.8 required
  
- [Svg2AndroidTester](https://github.com/RaysonYeungHK/Svg2AndroidXml/tree/master/Svg2AndroidTester)

  Android Project to test the accurate usage, Android Studio 2.3.3
  
How to Use
---
1. Copy and paste the Svg2Android.jar to the Project root directory. (As same directory as the settings.gradle placed)

2. Copy following code to the app build.gradle file

       build.dependsOn('svg2xml')
    
       task svg2xml(type: Exec) {
            println "$projectDir"
            workingDir "$projectDir"
            javaexec {
                main = "-jar";
                args = [
                        "../Svg2Android.jar",
                        "./src/main/svg", // Source folder
                        "./src/main/res/drawable" // output folder
                ]
            }
        }

3. Simply build the project, then all svg will be converted to android support xml files

License
---
Svg2Android is released under [The GNU General Public License v3.0](https://github.com/RaysonYeungHK/Svg2AndroidXml/tree/master/LICENSE).

This project is developed base on [Google Android Opensource project](https://android.googlesource.com/platform/tools/base/)


