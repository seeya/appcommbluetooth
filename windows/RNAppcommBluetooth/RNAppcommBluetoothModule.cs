using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Appcomm.Bluetooth.RNAppcommBluetooth
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNAppcommBluetoothModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNAppcommBluetoothModule"/>.
        /// </summary>
        internal RNAppcommBluetoothModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNAppcommBluetooth";
            }
        }
    }
}
