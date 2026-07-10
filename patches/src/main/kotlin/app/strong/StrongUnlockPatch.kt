package app.strong

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.shared.Constants

@Suppress("unused")
val strongUnlockPatch = bytecodePatch(
    name = "Strong PRO Forever Unlock",
    description = "Unlocks Strong PRO Forever subscription status.",
    default = true
) {
    compatibleWith(Constants.COMPATIBILITY_STRONG)

    execute {
        H4Fingerprint.method.addInstructions(
            0,
            """
                sget-object v0, Lep6;->i:Lep6;
                return-object v0
            """
        )
    }
}
