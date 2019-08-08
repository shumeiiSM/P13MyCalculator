package com.example.p13mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mycal = ""
    var number = ""
    var number2 = ""

    var final = ""

    var start = 0
    var press = false

    var numbers: MutableList<Double> = mutableListOf<Double>()
    var calculation: MutableList<String> = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnNum(view: View) {
        val btnSelected = view as Button

        when (btnSelected.id) {
            btnOne.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "1"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "1"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "1"
                        tvFinal.text = "$number"
                    } else {
                        number += "1"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnTwo.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "2"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "2"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "2"
                        tvFinal.text = "$number"
                    } else {
                        number += "2"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnThree.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "3"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "3"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "3"
                        tvFinal.text = "$number"
                    } else {
                        number += "3"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnFour.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "4"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "4"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "4"
                        tvFinal.text = "$number"
                    } else {
                        number += "4"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnFive.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "5"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "5"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "5"
                        tvFinal.text = "$number"
                    } else {
                        number += "5"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnSix.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "6"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "6"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "6"
                        tvFinal.text = "$number"
                    } else {
                        number += "6"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnSeven.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "7"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "7"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "7"
                        tvFinal.text = "$number"
                    } else {
                        number += "7"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnEight.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "8"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "8"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "8"
                        tvFinal.text = "$number"
                    } else {
                        number += "8"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnNine.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "9"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "9"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "9"
                        tvFinal.text = "$number"
                    } else {
                        number += "9"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnZero.id -> {
                if (press == true) {
                    if (start == 0) {
                        number2 = "0"
                        tvFinal.text = "$number2"
                        press = false
                    } else {
                        number2 += "0"
                        tvFinal.text = "$number2"
                        press = false
                    }
                    start++

                } else {
                    if (start == 0) {
                        number = "0"
                        tvFinal.text = "$number"
                    } else {
                        number += "0"
                        tvFinal.text = "$number"
                    }
                    start++
                }
            }

            btnPoint.id -> {
                if (press == true) {
                    number2 += "."
                    tvFinal.text = "$number2"
                    press = false

                } else {
                    number += "."
                    tvFinal.text = "$number"
                }
            }
        }
    }


    fun btnCal(view: View) {
        val btnSelected = view as Button

        when (btnSelected.id) {
            btnDivide.id -> {
                mycal = "/"
                press = true
            }

            btnMultiply.id -> {
                mycal = "*"
                press = true
            }

            btnMinus.id -> {
                mycal = "-"
                press = true
            }

            btnAdd.id -> {
                mycal = "+"
                press = true
            }

            btnEqual.id -> {
                mycal = "="
                var num = 0.0
                var calNum = ""

                for (i in mycal) {
                    if (i.equals('+') || i.equals('*') || i.equals('/') || i.equals('-') || i.equals('=')) {
                        numbers.add(calNum.toDouble())
                        calculation.add(i.toString())
                        calNum = ""
                    } else {
                        calNum += i
                    }
                }

                var counter = 0
                for (i in 0..(numbers.size - 1)) {
                    if (counter == 0) {
                        num = numbers.get(i)

                    } else {

                        var numb = numbers.get(i)
                        var cal = calculation.get(i - 1)
                        if (cal.equals("+")) {
                            num = num + numb
                        } else if (cal.equals("*")) {
                            num = num * numb
                        } else if (cal.equals("-")) {
                            num = num - numb
                        } else if (cal.equals("/")) {
                            num = num / numb
                        }
                    }
                    counter++
                }

                final = "$num"
                numbers.clear()
                calculation.clear()

                tvFinal.text = "$final"

            }
        }
    }


}
