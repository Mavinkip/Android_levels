##1. Welcome!
 Here you'll learn how to build and run your first Android app in the Kotlin programming language
 ![Image Description](Pasted%20image%2020240530013228.png)

 
 ![Pasted%20image%2020240530012946.png](Pasted%20image%2020240530012946.png)


## **What you'll learn**

- How to use Android Studio to build your app.
- How to run your app on a device or in the emulator.
- How to add interactive buttons.
- How to add a new activity 
- How to display a second screen when a button is pressed. 

**Step 1: Create a new project**

1. Open Android Studio.
2. In the **Welcome to Android Studio** dialog, click **Start a new Android Studio project**.
3. Select Empty Activity. Click **Next**.

##**Step 3: Explore the project structure and layout**
1. Double-click the **app (1)** folder to expand the hierarchy of app files
2. If you click **Project (2)**, you can hide or show the **Project** view.
3. The current **Project** view selection is **Project > Android**.
In the **Project > Android** view you see three or four top-level folders below your **app** folder: **manifests**, **java**, **java (generated)** and **res**. You may not see **java (generated)** right away.

1. Expand the **manifests** folder.

This folder contains `AndroidManifest.xml`**.** This file describes all the components of your Android app and is read by the Android runtime system when your app is executed. 2. Expand the **java** folder. All your Kotlin language files are organized here; Android projects keep all Kotlin language files in this folder, together with any Java sources. The **java** folder contains three subfolders:

**com.example.startingbasic (or the domain name you have specified)**:** This folder contains the Kotlin source code files for your app.

**com.example.startingbasic (androidTest):** This folder is where you would put your instrumented tests, which are tests that run on an Android device. It starts out with a skeleton test file.

**com.example.startingbasic (test):** This folder is where you would put your unit tests. Unit tests don't need an Android device to run. It starts out with a skeleton unit test file. 3. Expand the **res** folder. This folder contains all the resources for your app, including images, layout files, strings, icons, and styling. It includes these subfolders:

**drawable**: All your app's images will be stored in this folder.

**layout**: This folder contains the UI layout files for your activities. Currently, your app has one activity that has a layout file called `activity_main.xml`. 

**menu:** This folder contains XML files describing any menus in your app.

**mipmap**: This folder contains the launcher icons for your app.

**navigation:** This folder contains the navigation graph, which tells Android Studio how to navigate between different parts of your application.

**values**: Contains resources, such as strings and colors, used in your app



this is the default Design view when u have created your  first  first project.
It will show how the app or what you are making will look like and by default it will show hello ![Image Description](Screenshot%202024-05-29%20105008%201.png)







Then there is the  Split view where it shows  the design itself and the code you can write the code and see the template change simultaneously 
![Image Description](Screenshot%202024-05-29%20105712%202.png)





Finally there is the code view it shows only the code of design and u can just write the code then go back to design to see what changes you have made
![Image Description](code%201.png)


In design and split there is the palette
![[Screenshot 2024-05-29 111332.png]]
Here you can add Textview, Button, ImageView, RecyclerView and more


Now run it and see it in our emulator  or phone 

## Run your app on your new emulator

1. In Android Studio, select **Run > Run ‘app',** or click the **Run** icon in the toolbar. ![609c3e4473493202.png](https://developer.android.com/static/codelabs/build-your-first-android-app-kotlin/img/609c3e4473493202.png) The icon changes once your app is running. ![edee73c1aed2b57e.png](https://developer.android.com/static/codelabs/build-your-first-android-app-kotlin/img/edee73c1aed2b57e.png)


![[Pasted image 20240529112815.png]]If you get a dialog box stating "Instant Run requires that the platform corresponding to your target device (Android N...) is installed" go ahead and click **Install and continue.**

2. In **Run > Select Device**, under **Available devices**, select the virtual device that you just configured. A dropdown menu also appears in the toolbar.
3. ![[Pasted image 20240529115304.png]]
The emulator starts and boots just like a physical device. Depending on the speed of your computer, this may take a while. You can look in the small horizontal status bar at the very bottom of Android Studio for messages to see the progress.

This is how your app will look like in the emulator
![Image Description](Pasted%20image%2020240529114551.png)





## Run your app on a device (if you have one)

What you need:

- An Android device such as a phone or tablet.
- A data cable to connect your Android device to your computer via the USB port.
- If you are using a Linux or Windows OS, you may need to perform additional steps to run your app on a hardware device. Check the [Run Apps on a Hardware Device](http://developer.android.com/tools/device.html) documentation. On Windows, you may need to install the appropriate USB driver for your device. See [OEM USB Drivers](http://developer.android.com/tools/extras/oem-usb.html).

### **Run your app on a device**

To let Android Studio communicate with your device, you must turn on USB Debugging on your Android device.

On Android 4.2 and higher, the Developer options screen is hidden by default. To show Developer options and enable USB Debugging:

1. On your device, open **Settings > About phone** and tap **Build number** seven times.
2. Return to the previous screen (**Settings**). **Developer options** appears at the bottom of the list. Tap **Developer options**.
3. Enable **USB Debugging**.
4![Image Description](Pasted%20image%2020240529115917.png)


Now you can connect your device and run the app from Android Studio.

1. Connect your device to your development machine with a USB cable. On the device, you might need to agree to allow USB debugging from your development device.
2. In Android Studio, click **Run** ![609c3e4473493202.png](https://developer.android.com/static/codelabs/build-your-first-android-app-kotlin/img/609c3e4473493202.png) in the toolbar at the top of the window. (You might need to select **View > Toolbar** to see this option.) The **Select Deployment Target** dialog opens with the list of available emulators and connected devices.
3. Select your device, and click **OK**. Android Studio installs the app on your device and runs it.

**Note**: If your device is running an Android platform that isn't installed in Android Studio, you might see a message asking if you want to install the needed platform. Click **Install and Continue**, then click **Finish** when the process is complete.

## **Troubleshooting**

If you're stuck, quit Android Studio and restart it.

If Android Studio does not recognize your device, try the following:

1. Disconnect your device from your development machine and reconnect it.
2. Restart Android Studio.

If your computer still does not find the device or declares it "unauthorized":

1. Disconnect the device.
2. On the device, open **Settings->Developer Options**.
3. Tap **Revoke USB Debugging authorizations**.
4. Reconnect the device to your computer.
5. When prompted, grant authorizations.

If you are still having trouble, check that you installed the appropriate USB driver for your device. See the [Using Hardware Devices documentation](http://developer.android.com/tools/device.html).

Check the [troubleshooting section in the Android Studio documentation](https://developer.android.com/studio/troubleshoot).


## **Add color resources**

First, you'll learn how to add new color resources.

**Change the text color and background of the TextView**

1. In the **Project** panel on the left, double-click on **res** > **values** > **colors.xml** to open the color resource file.
2.![Image Description](Pasted%20image%2020240529122322.png)

3. 
4. adding my own background  color
5. ![Image Description](Pasted%20image%2020240529122600.png)



```xml
<resources>  
    <color name="black">#FF000000</color>  
    <color name="white">#FFFFFFFF</color>  
  
    //add you own backround color  
    <color name="mybackground">#972323</color>  
  
</resources>
```
The `colors.xml` file opens in the editor. So far, three colors have been defined. These are the colors you can see in your app layout (for example, purple for the app bar).

first lets make the text bigger and bold 
   1 Go back to activity_main.xml so you can see the XML code for the layout.
   Add a new property to the `TextView` called `android:textsize, and android:textstyle and start typing to set its value 32sp and bold. You can add this property anywhere inside the TextView 
  ![Image Description](Pasted%20image%2020240529124232.png)

   how it will look 
  ![Image Description](Pasted%20image%2020240529124311.png)


2. then back to activity_main.xml so you can see the XML code for the layout.
3. Add a new property to the `TextView` called `android:background`, and start typing to set its value to `@color`. You can add this property anywhere inside the TextView code.
4. A menu pops up offering the predefined color resources:
![Image Description](Pasted%20image%2020240529124423.png)

 4. Choose **@color/mybackground
5. Change the property `android:textColor` and give it a value of `@android:color/white`.
![Image Description](Pasted%20image%2020240529124959.png)


```xml
<TextView  
    android:layout_width="wrap_content"  
    android:layout_height="wrap_content"  
    android:text="Hello World!"  
    android:textSize="64sp"  
    android:textStyle="bold"  
    android:background="@color/mybackground"  
    android:textColor="@color/white"  
    app:layout_constraintBottom_toBottomOf="parent"  
    app:layout_constraintEnd_toEndOf="parent"  
    app:layout_constraintStart_toStartOf="parent"  
    app:layout_constraintTop_toTopOf="parent" />
```

## **Add a new color to use as the screen background color**

1. Back in `colors.xml`, create a new color resource called screenBackground:
2. 
  ```xml
  <color name="screenbackground">#05276A</color>
```
2. Go back to `fragment_first.xml`.
3. In the **Component Tree**, select the `ConstraintLayout`.![Image Description 1](Pasted%20image%2020240529125919.png)

![Image Description 2](98c54173559bb461.png)

![Image Description 3](Pasted%20image%2020240529130056.png)

4. 
5. In the **Attributes** panel, select the **background** property and press **Enter**. Type "c" in the field that appears.
6. ![Image Description 1](Pasted%20image%2020240529130207.png)

![Image Description 2](Pasted%20image%2020240529130454.png)

7. In the menu of colors that appears, select **@color/screenBackground**. Press **Enter** to complete the selection.
8. ![Image Description](Pasted%20image%2020240529130653.png)

## **Add buttons and constrain their positions**
pick from the pallet button and double click or drag to the design template
![Image Description](Pasted%20image%2020240529130953.png)



The square represents the selected view. Each of the grey dots represents a constraint, to the top, bottom, left, and right;
![Image Description 1](Pasted%20image%2020240529131521.png)
![Image Description 2](Pasted%20image%2020240529131711.png)

### **To delete a constraint:**

- In the design view or blueprint view, hold the `Ctrl` key (`Command` on a Mac) and move the cursor over the circle for the constraint until the circle highlights, then click the circle. ![1f8c250ad15873d5.png](https://developer.android.com/static/codelabs/build-your-first-android-app-kotlin/img/1f8c250ad15873d5.png)
- Or click on one of the constrained views, then right-click on the constraint and select **Delete** from the menu.
- Or in the **Attributes** panel, move the cursor over the circle for the constraint until it shows an x, then click it.

![7f4931356c145bab.png](https://developer.android.com/static/codelabs/build-your-first-android-app-kotlin/img/7f4931356c145bab.png)

If you delete a constraint and want it back, either undo the action, or create a new constraint.

## **Step 5: Delete the chain constraints**

1. Click on the  button, and then delete the constraint from the top of the button to the `TextView`.
2. Click on the `TextView`, and then delete the constraint from the bottom of the text to the  button.
lets add two more buttons and name them Next, Add and Subtract
![Image Description](Pasted%20image%2020240529132004.png)

To name them click on the button u want to name the on the attribute panel and change the name there
![Image Description 1](Pasted%20image%2020240529132148.png)
![Image Description 2](Pasted%20image%2020240529132227.png)
where the was button rite next the do the same to the other two naming add and subtract

![Image Description](Pasted%20image%2020240529132423.png)

Here is the full code
```xml
<?xml version="1.0" encoding="utf-8"?>  
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"  
    xmlns:tools="http://schemas.android.com/tools"  
    android:layout_width="match_parent"  
    android:layout_height="match_parent"  
    android:background="@color/screenbackground"  
    tools:context=".MainActivity">  
  
    <TextView        android:id="@+id/textView"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:background="@color/mybackground"  
        android:text="Hello World!"  
        android:textColor="@color/white"  
        android:textSize="64sp"  
        android:textStyle="bold"  
        app:layout_constraintBottom_toBottomOf="parent"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.733"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toTopOf="parent"  
        app:layout_constraintVertical_bias="0.794" />  
  
    <Button        android:id="@+id/button"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginBottom="8dp"  
        android:text="Next"  
        app:layout_constraintBottom_toTopOf="@+id/textView"  
        tools:layout_editor_absoluteX="60dp" />  
  
    <Button        android:id="@+id/button2"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:text="Add"  
        app:layout_constraintBottom_toTopOf="@+id/textView"  
        tools:layout_editor_absoluteX="186dp" />  
  
    <Button        android:id="@+id/button3"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:text="Subtract"  
        app:layout_constraintBottom_toTopOf="@+id/textView"  
        tools:layout_editor_absoluteX="295dp" />  
  
</androidx.constraintlayout.widget.ConstraintLayout>
```
## **Add a Edit text **
On the palette search box search EditText and pick the plain text ![Image Description 1](Pasted%20image%2020240529133049.png)
![Image Description 2](Pasted%20image%2020240529133133.png)
lets chage the EditText Background to white
   1 go back to activity_main.xml so you can see the XML code for the layout.
3. Add a new property to the `EditText` called `android:background`, and start typing to set its value to `@color`. .
4.![Image Description 1](Pasted%20image%2020240529133512.png)
![Image Description 2](Pasted%20image%2020240529133542.png)



```xml
<EditText  
    android:id="@+id/editTextText2"  
    android:layout_width="wrap_content"  
    android:layout_height="wrap_content"  
    android:ems="10"  
    android:inputType="text"  
    android:background="@color/white"  
    tools:layout_editor_absoluteX="52dp"  
    tools:layout_editor_absoluteY="134dp" />
```


now ad the constrain for the text view
![Image Description](Pasted%20image%2020240529133851.png)
Add another text view and also change  the  back ground
![Image Description 1](Pasted%20image%2020240529134206.png)
![Image Description 2](Pasted%20image%2020240529134322.png)
Then add the constrains
![Image Description](Pasted%20image%2020240529134417.png)
now make the text color in the edit text be black for both edit text
and also add hint Enter number

```xml
android:textColor="@color/black"
```
```xml
android:hint="Ente number"
```

here are the edit text code
```xml
<EditText  
    android:id="@+id/editTextText2"  
    android:layout_width="wrap_content"  
    android:layout_height="wrap_content"  
    android:layout_marginBottom="148dp"  
    android:textColor="@color/black"  
    android:hint="Ente number"  
    android:background="@color/white"  
    android:ems="10"  
    android:inputType="text"  
    app:layout_constraintBottom_toTopOf="@+id/button2"  
    app:layout_constraintEnd_toEndOf="parent"  
    app:layout_constraintHorizontal_bias="0.589"  
    app:layout_constraintStart_toStartOf="parent"  
    app:layout_constraintTop_toBottomOf="@+id/editTextText4" />  
  
<EditText  
    android:id="@+id/editTextText4"  
    android:layout_width="wrap_content"  
    android:layout_height="wrap_content"  
    android:layout_marginTop="184dp"  
    android:background="@color/white"  
    android:hint="Ente number"  
    android:ems="10"  
    android:inputType="text"  
    android:textColor="@color/black"  
    app:layout_constraintEnd_toEndOf="parent"  
    app:layout_constraintHorizontal_bias="0.589"  
    app:layout_constraintStart_toStartOf="parent"  
    app:layout_constraintTop_toTopOf="parent" />
```

and also remove the text hello world and replace it with  hint results
```xml<TextView  
    android:id="@+id/textView"  
    android:layout_width="wrap_content"  
    android:layout_height="wrap_content"  
    android:background="@color/mybackground"  
    android:hint="Result"  
    android:textColor="@color/white"  
    android:textSize="64sp"  
    android:textStyle="bold"  
    app:layout_constraintBottom_toBottomOf="parent"  
    app:layout_constraintEnd_toEndOf="parent"  
    app:layout_constraintHorizontal_bias="0.733"  
    app:layout_constraintStart_toStartOf="parent"  
    app:layout_constraintTop_toTopOf="parent"  
    app:layout_constraintVertical_bias="0.794" />
```


![Image Description](Pasted%20image%2020240529135408.png)




```xml

<?xml version="1.0" encoding="utf-8"?>  
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"  
    xmlns:tools="http://schemas.android.com/tools"  
    android:layout_width="match_parent"  
    android:layout_height="match_parent"  
    android:background="@color/screenbackground"  
    tools:context=".MainActivity">  
  
    <TextView       
        android:id="@+id/textView"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:background="@color/mybackground"  
        android:hint="Result"  
        android:textColor="@color/white"  
        android:textSize="64sp"  
        android:textStyle="bold"  
        app:layout_constraintBottom_toBottomOf="parent"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.552"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toTopOf="parent"  
        app:layout_constraintVertical_bias="0.794" />  
  
    <Button        android:id="@+id/button"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginBottom="8dp"  
        android:text="Next"  
        app:layout_constraintBottom_toTopOf="@+id/textView"  
        app:layout_constraintEnd_toStartOf="@+id/button2"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toBottomOf="@+id/editTextText2"  
        app:layout_constraintVertical_bias="1.0" />  
  
    <Button        android:id="@+id/button2"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:text="Add"  
        app:layout_constraintBottom_toTopOf="@+id/textView"  
        tools:layout_editor_absoluteX="186dp" />  
  
    <Button        android:id="@+id/button3"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:text="Subtract"  
        app:layout_constraintBottom_toTopOf="@+id/textView"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintStart_toEndOf="@+id/button2"  
        app:layout_constraintTop_toBottomOf="@+id/editTextText2"  
        app:layout_constraintVertical_bias="0.966" />  
  
    <EditText        android:id="@+id/editTextText2"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginBottom="148dp"  
        android:textColor="@color/black"  
        android:hint="Ente number"  
        android:background="@color/white"  
        android:ems="10"  
        android:inputType="text"  
        app:layout_constraintBottom_toTopOf="@+id/button2"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.589"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toBottomOf="@+id/editTextText4" />  
  
    <EditText        android:id="@+id/editTextText4"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginTop="184dp"  
        android:background="@color/white"  
        android:hint="Ente number"  
        android:ems="10"  
        android:inputType="text"  
        android:textColor="@color/black"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.589"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toTopOf="parent" />  
  
  
</androidx.constraintlayout.widget.ConstraintLayout>
```



## [Make your app interactive]
now this is adding logic to it and before we do that lets rename the id
for the Text view :
from android:id="@+id/textView"  to android:id="@+id/resultTextView"

Next button
from button to nextButton

Add button
from button1 to addButton 

Subtract Button
from button2 to subtractButton 

EdithText 
from editTextText2 to number1 
from editTextText4 to number2

updated xml
```xml

<?xml version="1.0" encoding="utf-8"?>  
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"  
    xmlns:tools="http://schemas.android.com/tools"  
    android:layout_width="match_parent"  
    android:layout_height="match_parent"  
    android:background="@color/screenbackground"  
    tools:context=".MainActivity">  
  
    <TextView        android:id="@+id/resultTextView"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:background="@color/mybackground"  
        android:hint="Result"  
        android:textColor="@color/white"  
        android:textSize="64sp"  
        android:textStyle="bold"  
        app:layout_constraintBottom_toBottomOf="parent"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.5"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toTopOf="parent"  
        app:layout_constraintVertical_bias="0.8" />  
  
    <Button        android:id="@+id/nextButton"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginBottom="8dp"  
        android:text="Next"  
        app:layout_constraintBottom_toTopOf="@+id/resultTextView"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.049"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toBottomOf="@+id/number2"  
        app:layout_constraintVertical_bias="1.0" />  
  
    <Button        android:id="@+id/addButton"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginStart="8dp"  
        android:layout_marginBottom="8dp"  
        android:text="Add"  
        app:layout_constraintBottom_toTopOf="@+id/resultTextView"  
        app:layout_constraintEnd_toStartOf="@+id/subtractButton"  
        app:layout_constraintStart_toEndOf="@+id/nextButton" />  
  
    <Button        android:id="@+id/subtractButton"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginEnd="28dp"  
        android:text="Subtract"  
        app:layout_constraintBottom_toTopOf="@+id/resultTextView"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintTop_toBottomOf="@+id/number2"  
        app:layout_constraintVertical_bias="0.952" />  
  
    <EditText        android:id="@+id/number1"  
        android:layout_width="0dp"  
        android:layout_height="wrap_content"  
        android:layout_marginTop="16dp"  
        android:layout_marginBottom="16dp"  
        android:background="@color/white"  
        android:hint="Enter number"  
        android:inputType="numberDecimal"  
        android:minHeight="48dp"  
        android:textColor="@color/black"  
        app:layout_constraintBottom_toTopOf="@+id/number2"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.5"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toTopOf="parent" />  
  
    <EditText        android:id="@+id/number2"  
        android:layout_width="0dp"  
        android:layout_height="wrap_content"  
        android:layout_marginBottom="16dp"  
        android:background="@color/white"  
        android:hint="Enter number"  
        android:inputType="numberDecimal"  
        android:minHeight="48dp"  
        android:textColor="@color/black"  
        app:layout_constraintBottom_toTopOf="@+id/addButton"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.5"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toBottomOf="@+id/number1" />  
  
</androidx.constraintlayout.widget.ConstraintLayout>
```

now let move to MainActivity.kt
![Image Description 1](Pasted%20image%2020240529233140.png)
![Image Description 2](Pasted%20image%2020240529233116.png)



## **Add functionality to the add and subtract button

first we need to call the id in the xml and here is how
```kotlin
// Retrieves references to the UI elements using their IDs 
val number1EditText = findViewById<EditText>(R.id.number1) // EditText for first number
val number2EditText = findViewById<EditText>(R.id.number2) // EditText for second number 
val addButton = findViewById<Button>(R.id.addButton) // Button to perform addition 
val subtractButton = findViewById<Button>(R.id.subtractButton) // Button to perform subtraction 
val resultTextView = findViewById<TextView>(R.id.resultTextView) // TextView to display the result
```

![Image Description](Pasted%20image%2020240529234242.png)

After assigning all the id from the xml now lets make it to that when we click on add button it dose something
```kotlin

// Sets an OnClickListener on the addButton to perform addition when clicked 
addButton.setOnClickListener { 
// Retrieves and converts the input from the EditTexts to Double 
val number1 = number1EditText.text.toString().toDoubleOrNull() val number2 = number2EditText.text.toString().toDoubleOrNull()
// Checks if both inputs are valid numbers 
if (number1 != null && number2 != null) { 
// Performs addition and updates the resultTextView with the result 
val result = number1 + number2 resultTextView.text = "Result: $result" }
else { 
// Displays an error message if the inputs are not valid numbers 
resultTextView.text = "Please enter valid numbers" } }
```

now to Subtract
```kotlin
// Sets an OnClickListener on the subtractButton to perform subtraction when clicked 
subtractButton.setOnClickListener {
// Retrieves and converts the input from the EditTexts to Double 
val number1 = number1EditText.text.toString().toDoubleOrNull() val number2 = number2EditText.text.toString().toDoubleOrNull() 
// Checks if both inputs are valid numbers 
if (number1 != null && number2 != null) { 
// Performs subtraction and updates the resultTextView with the result 
val result = number1 - number2 resultTextView.text = "Result: $result" }
else { 
// Displays an error message if the inputs are not valid numbers 
resultTextView.text = "Please enter valid numbers" } } }
```
Now lets run the app and see if it work 
![Image Description](Pasted%20image%2020240529235408.png)


the add button works well![Image Description](Pasted%20image%2020240529235515.png)



the subtract button also works![Image Description](Pasted%20image%2020240529235707.png)




##  [Moving to Next Page]
first lets make that next  page

1. **Open the App Folder**:
    
    - In the Project view, expand the `app` folder by clicking on the arrow next to it.
    ![Image Description](Pasted%20image%2020240530000400.png)

1. **Open the Java or Kotlin Folder**:
    
    - Inside the `app` folder, expand the `java` (or `kotlin`, if you're using Kotlin) folder.
    - You will see several folders corresponding to your application's package name. Expand the folder that corresponds to your main package.
    - ![Image Description](Pasted%20image%2020240530000400.png)

1. **Right-Click the Package Folder**:
    
    - Right-click on the package folder where you want to create the new activity. This is usually the folder that contains your `MainActivity`.
    - ![Image Description](Pasted%20image%2020240530000429.png)

1. **Select New > Activity**:
    
    - From the context menu that appears, hover over `New`.
    - In the submenu, click on `Activity`.
    - ![Image Description](Pasted%20image%2020240530000557.png)

1. **Choose the Activity Type**:
    
    - A dialog box will appear with different types of activities you can create. Select `Empty Activity`.
    - ![Image Description](Pasted%20image%2020240530000635.png)

- 1. **Configure the New Activity**:
    
    - A new dialog box will appear asking for configuration details for the new activity.
    - **Activity Name**: Enter a name for the new activity (e.g., `SecondActivity`).
    - **Generate Layout File**: Ensure this option is checked. This will create an associated XML layout file.
    - **Backwards Compatibility (AppCompat)**: Ensure this option is checked to use AppCompatActivity.
  - **Launcher Activity**: Leave this unchecked unless you want this new activity to be the entry point of your application.![Image Description 1](Pasted%20image%2020240530000720.png)
![Image Description 2](Pasted%20image%2020240530000849.png)
then finish

As u can see an activity `SecondActivity` and layout `activity_second.xml` file have been crated
![Image Description](Pasted%20image%2020240530001021.png)


## **Making Next button functional**
in kotlin to move from one page to anoter is by using intent
```kotlin
val intent = Intent(this, SecondActivity::class.java)
startActivity(intent)


```
- `Intent`: This is a class provided by the Android framework. It represents an intention to perform an action. In this case, the action is to start a new activity.
- `this`: This refers to the current instance of the `Activity` (e.g., `MainActivity`). It provides the context in which the Intent is being created. The context is essential as it tells the system where the Intent is coming from.
- `SecondActivity::class.java`: This specifies the class of the activity you want to start. In this case, `SecondActivity`. The `::class.java` part is Kotlin syntax to get the Java class of `SecondActivity`.

Putting it all together, `Intent(this, SecondActivity::class.java)` creates a new Intent that tells the system, "I want to start `SecondActivity` from the current context (`this`)."

- `startActivity`: This is a method provided by the `Activity` class. It starts the new activity specified by the Intent.
- `intent`: This is the Intent object we created earlier. It contains the information about which activity to start.
now lets put it into the Next button when its clicked 
```kotlin
// Set an OnClickListener on the nextButton  
nextButton.setOnClickListener {  
    // Create an Intent to start SecondActivity  
    // 'this' refers to the current Activity (MainActivity in this case)    
    // SecondActivity::class.java specifies the target activity to start    
    val intent = Intent(this, SecondActivity::class.java)  
  
    // Use the startActivity method to start the new activity  
    // The intent parameter contains the information about which activity to start
        startActivity(intent)  
}
```

![Image Description](Pasted%20image%2020240530004109.png)
if u ever encounter this  then its not an error it just need u to import the Intent or sometimes the thing that is highlighted like textview, button or anything like that

**Second Activity content

in the second activity we will create a button that will congratulate you for making an app and a previous button

let us  design  the `activity_second.xml'
add the congratulation button and give it an id called message Button
![Image Description 1](Pasted%20image%2020240530005121.png)
![Image Description 2](Pasted%20image%2020240530005241.png)



now add the previous button with id back button 
![Image Description 1](Pasted%20image%2020240530005454.png)
![Image Description 2](Pasted%20image%2020240530005744.png)



Background color lets give it  my background 
![Image Description 1](Pasted%20image%2020240530005908.png)
![Image Description 2](Pasted%20image%2020240530005932.png)



```xml
<?xml version="1.0" encoding="utf-8"?>  
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"  
    xmlns:tools="http://schemas.android.com/tools"  
    android:id="@+id/back"  
    android:layout_width="match_parent"  
    android:layout_height="match_parent"  
    android:background="@color/mybackground"  
    tools:context=".SecondActivity">  
  
    <Button        android:id="@+id/messageButton"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginTop="196dp"  
        android:text="Congratulation"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.533"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toTopOf="parent" />  
  
    <Button        android:id="@+id/backbutton"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:text="Previous"  
        app:layout_constraintBottom_toBottomOf="parent"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.498"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toBottomOf="@+id/messageButton"  
        app:layout_constraintVertical_bias="0.46" />  
</androidx.constraintlayout.widget.ConstraintLayout>

```


Main Activity code
```kotlin
package com.example.startingbasic  
  
import android.content.Intent  
import androidx.appcompat.app.AppCompatActivity  
import android.os.Bundle  
import android.widget.Button  
import android.widget.EditText  
import android.widget.TextView  
  
class MainActivity : AppCompatActivity() {  
    override fun onCreate(savedInstanceState: Bundle?) {  
        super.onCreate(savedInstanceState)  
        setContentView(R.layout.activity_main)  
  
        // Retrieves references to the UI elements using their IDs  
        val number1EditText = findViewById<EditText>(R.id.number1) // EditText for first number  
        val number2EditText = findViewById<EditText>(R.id.number2) // EditText for second number  
        val addButton = findViewById<Button>(R.id.addButton)  
        val nextButton = findViewById<Button>(R.id.nextButton) // Button to perform addition  
        val subtractButton = findViewById<Button>(R.id.subtractButton) // Button to perform subtraction  
        val resultTextView = findViewById<TextView>(R.id.resultTextView) // TextView to display the result  
  
  
    // Sets an OnClickListener on the addButton to perform addition when clicked        
        addButton.setOnClickListener {  
            // Retrieves and converts the input from the EditTexts to Double  
            val number1 = number1EditText.text.toString().toDoubleOrNull()  
            val number2 = number2EditText.text.toString().toDoubleOrNull()  
  
            // Checks if both inputs are valid numbers  
            if (number1 != null && number2 != null) {  
            // Performs addition and updates the resultTextView with the result  
                val result = number1 + number2  
                resultTextView.text = "Result: $result"  
            } else {  
                // Displays an error message if the inputs are not valid numbers  
                resultTextView.text = "Please enter valid numbers"  
            }  
        }  
  
  
            // Sets an OnClickListener on the subtractButton to perform subtraction when clicked  
            subtractButton.setOnClickListener {  
                // Retrieves and converts the input from the EditTexts to Double  
                val number1 = number1EditText.text.toString().toDoubleOrNull()  
                val number2 = number2EditText.text.toString().toDoubleOrNull()  
  
                // Checks if both inputs are valid numbers  
                if (number1 != null && number2 != null) {  
                    // Performs subtraction and updates the resultTextView with the result  
                    val result = number1 - number2  
                    resultTextView.text = "Result: $result"  
                } else {  
                    // Displays an error message if the inputs are not valid numbers  
                    resultTextView.text = "Please enter valid numbers"  
                }  
            }  
        // Set an OnClickListener on the nextButton  
        nextButton.setOnClickListener {  
            // Create an Intent to start SecondActivity  
            // 'this' refers to the current Activity (MainActivity in this case)            // SecondActivity::class.java specifies the target activity to start            
            val intent = Intent(this, SecondActivity::class.java)  
  
            // Use the startActivity method to start the new activity  
    // The intent parameter contains the information about which activity to start            
            startActivity(intent)  
        }  
  
        }  
  
  
  
    }
```


 **Making Congratulation button functional**
 to make this button show a message we have to use toast
firs thing fist is getting the id from `activity_second.xml'

```kotlin
val messageButton = findViewById<Button>(R.id.messageButton)  
val Previous = findViewById<Button>(R.id.backbutton)
```

now the message display function

```kotlin
messageButton.setOnClickListener {  
    // Display a toast message when the button is clicked  
    Toast.makeText(this@SecondActivity, "Congratulations for making your first app!", Toast.LENGTH_SHORT).show()  
}
```


now the previous button

```kotlin
Previous.setOnClickListener {  
    // Create an Intent to start SecondActivity  
    // 'this' refers to the current Activity (SecondActivivty in this case)    // MainActivity::class.java specifies the target activity to start 
       val intent = Intent(this, MainActivity::class.java)  
  
    // Use the startActivity method to start the new activity  
    // The intent parameter contains the information about which activity to start    
    startActivity(intent)  
}
```
it will go from Second Activity to Main Activity


activity_second.xml
```xml
<?xml version="1.0" encoding="utf-8"?>  
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"  
    xmlns:tools="http://schemas.android.com/tools"  
    android:id="@+id/back"  
    android:layout_width="match_parent"  
    android:layout_height="match_parent"  
    android:background="@color/mybackground"  
    tools:context=".SecondActivity">  
  
    <Button        android:id="@+id/messageButton"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_marginTop="196dp"  
        android:text="Congratulation"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.533"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toTopOf="parent" />  
  
    <Button        android:id="@+id/backbutton"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:text="Previous"  
        app:layout_constraintBottom_toBottomOf="parent"  
        app:layout_constraintEnd_toEndOf="parent"  
        app:layout_constraintHorizontal_bias="0.498"  
        app:layout_constraintStart_toStartOf="parent"  
        app:layout_constraintTop_toBottomOf="@+id/messageButton"  
        app:layout_constraintVertical_bias="0.46" />  
</androidx.constraintlayout.widget.ConstraintLayout>
```

Second Activity
```kotlin
package com.example.startingbasic  
  
import android.content.Intent  
import androidx.appcompat.app.AppCompatActivity  
import android.os.Bundle  
import android.widget.Button  
import android.widget.Toast  
  
class SecondActivity : AppCompatActivity() {  
    override fun onCreate(savedInstanceState: Bundle?) {  
        super.onCreate(savedInstanceState)  
        setContentView(R.layout.activity_second)  
  
        val messageButton = findViewById<Button>(R.id.messageButton)  
        val Previous = findViewById<Button>(R.id.backbutton)  
  
        messageButton.setOnClickListener {  
            // Display a toast message when the button is clicked  
            Toast.makeText(this@SecondActivity, "Congratulations for making your first app!", Toast.LENGTH_SHORT).show()  
        }  
  
  
        Previous.setOnClickListener {  
            // Create an Intent to start SecondActivity  
            
        // 'this' refers to the current Activity (SecondActivivty in this case)            
            // MainActivity::class.java specifies the target activity to start            
            val intent = Intent(this, MainActivity::class.java)  
  
            // Use the startActivity method to start the new activity  
    // The intent parameter contains the information about which activity to start            
            startActivity(intent)  
        }  
    }  
  
  
  
    }
```

lets run and see what we have
![Image Description 1](Pasted%20image%2020240530013125.png)
![Image Description 2](Pasted%20image%2020240530012946.png)


Congratulations you have made your first app fell proud cause this is just the start