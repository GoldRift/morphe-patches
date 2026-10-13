package app.hipaint.premium

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.string

/**
 * Monthly subscription state. Reads `PurchasedMonthSubscribe` and ORs in the temporary `SaleVip`
 * grant. Forcing it true also makes `f1()` (advanced features) and `g1()` (themes) true.
 */
object MonthSubscribeFingerprint : Fingerprint(
    returnType = "Z",
    filters = listOf(string("PurchasedMonthSubscribe")),
)
