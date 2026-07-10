package app.template.patches.strong

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

object H4Fingerprint : Fingerprint(
    definingClass = "Lso6;",
    name = "H4",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Lep6;",
    filters = listOf(
        string("PRO_FOREVER"),
        string("EARLY_ADOPTER"),
        fieldAccess(
            opcode = Opcode.SGET_OBJECT,
            definingClass = "Lep6;",
            name = "i",
            type = "Lep6;"
        ),
    )
)
