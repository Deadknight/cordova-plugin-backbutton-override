Backbutton Override plugin for Cordova / PhoneGap
======================================================

This Plugin is to override backbutton on android.

## Usage

Example Usage:

```js
navigator.BackbuttonOverride.overrideBackButton(function() {
  console.log('success')
}, function() {
  console.log('fail')
});
```

## Installation 

for Cordova >= 3.0.0

phonegap local plugin add https://github.com/Deadknight/cordova-plugin-backbutton-override

cordova plugin add https://github.com/Deadknight/cordova-plugin-backbutton-override

for Cordova >= 5.0.0

cordova plugin add cordova-plugin-backbutton

This has been successfully tested on Cordova 3.0 to 3.1.
