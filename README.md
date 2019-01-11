
# react-native-appcomm-bluetooth

## Getting started

`$ npm install react-native-appcomm-bluetooth --save`

### Mostly automatic installation

`$ react-native link react-native-appcomm-bluetooth`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-appcomm-bluetooth` and add `RNAppcommBluetooth.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAppcommBluetooth.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAppcommBluetoothPackage;` to the imports at the top of the file
  - Add `new RNAppcommBluetoothPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-appcomm-bluetooth'
  	project(':react-native-appcomm-bluetooth').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-appcomm-bluetooth/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-appcomm-bluetooth')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNAppcommBluetooth.sln` in `node_modules/react-native-appcomm-bluetooth/windows/RNAppcommBluetooth.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Appcomm.Bluetooth.RNAppcommBluetooth;` to the usings at the top of the file
  - Add `new RNAppcommBluetoothPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNAppcommBluetooth from 'react-native-appcomm-bluetooth';

// TODO: What to do with the module?
RNAppcommBluetooth;
```
  