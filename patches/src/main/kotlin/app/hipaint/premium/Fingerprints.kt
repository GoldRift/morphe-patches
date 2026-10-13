package app.hipaint.premium

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.string

object MonthSubscribeFingerprint : Fingerprint(
    returnType = "Z",
    filters = listOf(string("PurchasedMonthSubscribe")),
)
