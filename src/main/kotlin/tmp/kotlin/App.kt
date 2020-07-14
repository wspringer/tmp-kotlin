package tmp.kotlin

import flo.generator.core.postgres.SequenceGenerator
import flo.generator.ebt.TransactionIdGenerator

class App {

}

fun main(args: Array<String>) {
    val transactionIdGenerator = TransactionIdGenerator(
            accountId = "9301234567",
            source = SequenceGenerator(
                    url = "jdbc:pgsql://localhost:5432/flo",
                    user = "flo",
                    password = "flo",
                    sequenceName = "transaction_ids"
            )
    )

    transactionIdGenerator.generate()
}