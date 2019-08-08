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
    var dot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnNum(view: View) {
        val btnSelected = view as Button

        when (btnSelected.id) {
            btnAC.id -> {
                number = ""
                number2 = ""
                tvFinal.text = "0"
            }

            btnNP.id -> {
                val theValue = tvFinal.text.toString()
                val v = theValue.toInt()
                if (v < 0) {
                    theValue.substring(1)
                    tvFinal.text = "$theValue"
                } else {
                    tvFinal.text = "-$theValue"
                }
            }

            btnD.id -> {
                val theValue = tvFinal.text.toString()
                val d = theValue.toInt() / 100
                tvFinal.text = "$d"
                number = ""
            }

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
                    number = ""
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
                if (dot == false) {
                    if (press == true) {
                        number2 += "."
                        tvFinal.text = "$number2"
                        press = false
                        dot = true

                    } else {
                        number += "."
                        tvFinal.text = "$number"
                        dot = true
                    }
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
                var num = 0.0

                if (mycal.equals("+")) {
                    num = number.toDouble() + number2.toDouble()
                } else if (mycal.equals("*")) {
                    num = number.toDouble() * number2.toDouble()
                } else if (mycal.equals("-")) {
                    num = number.toDouble() - number2.toDouble()
                } else if (mycal.equals("/")) {
                    num = number.toDouble() / number2.toDouble()
                }


                final = "$num"

                tvFinal.text = "$final"

            }
        }
    }


}
