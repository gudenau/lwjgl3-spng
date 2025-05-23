/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.lwjgl.system.*;

/** Initializes the spng shared library. */
final class Spng {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_spng");
        Library.loadSystem(System::load, System::loadLibrary, Spng.class, "org.lwjgl.spng", libName);
    }

    private Spng() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
