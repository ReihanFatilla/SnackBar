# Snackbar & Toast

## Getting Started

These instructions an example of using 2 Custom Toast and Snackbar Libraries: 
### Installation

A step by step guide that will tell you how to get the development environment up and running.

```
$ // Custom Snackbar Library
$ implementation 'com.github.kishandonga:custom-snackbar:1.1'

$ // Motion Toast Library
$ implementation 'com.github.Spikeysanju:MotionToast:1.4'
```

## Usage

A few examples of useful commands and/or tasks.
### Custom Snack Bar

```
val sb = CustomSnackbar(this@MainActivity)
            sb.drawableRes(R.drawable.ic_check_green)
            sb.message("Snackbar Showed!")
            sb.withAction("Hide Snackbar") {
                sb.dismiss()
            }
            sb.cornerRadius(25f)
            sb.padding(20)
            sb.backgroundColor(Color.BLACK)
            sb.actionTextColor(Color.CYAN)
            sb.duration(Snackbar.LENGTH_LONG)
            sb.textColor(Color.WHITE)
            sb.show()
```
### Motion Toast
```
MotionToast.createColorToast(this,"Toast Showed!",
                "Succesfully showing a custom toast",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, R.font.helvetica_regular))
```

