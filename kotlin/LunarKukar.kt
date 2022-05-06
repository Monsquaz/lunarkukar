sealed class Value<T>(private val value: T, private var i: Int = 1) {

    operator fun invoke() = (i++)(this)
    operator fun invoke(block: () -> Unit) = print(value * i)() {
        block()() {
            this
        }
    }

    operator fun unaryPlus() = println()() { this }
    operator fun unaryMinus() = print("   ")() { this }
    operator fun not() = -(-(-this))

    operator fun Int.invoke(value: Value<T>) = value
    operator fun <U> Unit.invoke(block: () -> U) = block()

    operator fun <T> T.times(i: Int) = (1..i).map { this as Char }.joinToString("")
}

class Lunar : Value<Char>('O')
class Kukar : Value<Char>(' ')

fun main() {
    +(Lunar()) {
        (Kukar()()()) {
            (-Lunar()) {
                (Kukar()()) {
                    (Lunar()) {
                        (-Lunar()) {
                            (Kukar()()()) {
                                (Lunar()) {
                                    (-Lunar()()()()) {
                                        (-Lunar()()()()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        (!Lunar()) {
            (Kukar()()) {
                (Lunar()) {
                    (-Lunar()) {
                        (Kukar()()) {
                            (Lunar()) {
                                (-Lunar()) {
                                    (Kukar()()) {
                                        (Lunar()) {
                                            (-Lunar()()()()) {
                                                (-Lunar()()()()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    +(Lunar()) {
        (Kukar()()()) {
            (-Lunar()) {
                (Kukar()()) {
                    (Lunar()) {
                        (-Lunar()()) {
                            (Kukar()()) {
                                (Lunar()) {
                                    (-Lunar()) {
                                        (Kukar()()) {
                                            (Lunar()) {
                                                (-Lunar()) {
                                                    (Kukar()()) {
                                                        (Lunar()) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        (!Lunar()) {
            (Kukar()) {
                (Lunar()) {
                    (Kukar()) {
                        (-Lunar()) {
                            (Kukar()()) {
                                (Lunar()) {
                                    (-Lunar()) {
                                        (Kukar()) {
                                            (Lunar()) {
                                                (Kukar()) {
                                                    (-Lunar()) {
                                                        (Kukar()()) {
                                                            (Lunar()) {
                                                                (-Lunar()) {
                                                                    (Kukar()()) {
                                                                        (Lunar()) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    +(Lunar()) {
        (Kukar()()()) {
            (-Lunar()) {
                (Kukar()()) {
                    (Lunar()) {
                        (-Lunar()) {
                            (Kukar()) {
                                (Lunar()){
                                    (Kukar()) {
                                        (Lunar()) {
                                            (-Lunar()()()()) {
                                                (-Lunar()()()()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        (!Lunar()()) {
            (Kukar()()) {
                (-Lunar()) {
                    (Kukar()()) {
                        (Lunar()) {
                            (-Lunar()()) {
                                (Kukar()()) {
                                    (-Lunar()()()()) {
                                        (-Lunar()()()()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    +(Lunar()) {
        (Kukar()()()) {
            (-Lunar()) {
                (Kukar()()) {
                    (Lunar()) {
                        (-Lunar()) {
                            (Kukar()()) {
                                (Lunar()()) {
                                    (-Lunar()) {
                                        (Kukar()()) {
                                            (Lunar()) {
                                                (-Lunar()) {
                                                    (Kukar()) {
                                                        (Lunar()) {
                                                            (Kukar()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        (!Lunar()) {
            (Kukar()) {
                (Lunar()) {
                    (Kukar()) {
                        (-Lunar()) {
                            (Kukar()()) {
                                (Lunar()) {
                                    (-Lunar()) {
                                        (Kukar()) {
                                            (Lunar()) {
                                                (Kukar()) {
                                                    (-Lunar()) {
                                                        (Kukar()()) {
                                                            (Lunar()) {
                                                                (-Lunar()) {
                                                                    (Kukar()) {
                                                                        (Lunar()) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    +(Lunar()()()()) {
        (-Lunar()()()()) {
            (-Lunar()) {
                (Kukar()()()) {
                    (Lunar()) {
                        (-Lunar()) {
                            (Kukar()()) {
                                (Lunar()) {
                                    (-Lunar()) {
                                        (Kukar()()) {
                                            (Lunar()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        (!Lunar()) {
            (Kukar()()) {
                (Lunar()) {
                    (-Lunar()()()()) {
                        (-Lunar()) {
                            (Kukar()()) {
                                (Lunar()) {
                                    (-Lunar()) {
                                        (Kukar()()) {
                                            (Lunar()) {
                                                (-Lunar()) {
                                                    (Kukar()()) {
                                                        (Lunar()) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
