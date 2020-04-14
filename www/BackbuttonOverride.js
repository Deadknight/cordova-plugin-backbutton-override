var BackbuttonOverride = {
    overrideBackButton: function(successCallback, failureCallback) {
        cordova.exec(successCallback, failureCallback, 'BackbuttonOverridePlugin',
            'overrideBackButton', []);
    }
};

module.exports = Backbutton;