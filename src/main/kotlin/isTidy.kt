fun isTidy(input: String): Boolean = input
    .fold(true to '0') { (isTidy, prev), current ->
        (isTidy && prev <= current) to current
    }
    .first
