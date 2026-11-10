package app.hipaint.premium

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.patch
import app.shared.Constants

@Suppress("unused")
val unlockSubscriptionPatch = patch(
    name = "Unlock Subscription",
    description = "Unlocks subscription features. Requires the \"Spoof signature\" patch from the Morphe patches bundle to be enabled.",
    default = true,
) {
    compatibleWith(Constants.COMPATIBILITY_HIPAINT)

    execute {
        MonthSubscribeFingerprint.method.addInstructions(
            0,
            """
                const/4 v0, 0x1
                return v0
            """
        )
    }
}
