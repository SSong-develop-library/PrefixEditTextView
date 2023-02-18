# PrefixEditTextView

**Add Prefix Shape in EditText**

## Preview

<div>
<img src="https://github.com/SSong-develop/PrefixEditTextView/blob/main/art/preview1.gif" width="300" height="650"/>
<img src="https://github.com/SSong-develop/PrefixEditTextView/blob/main/art/preview2.gif" width="300" height="650"/>
</div>

## How To Use

```kotlin
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <com.ssong_develop.lib.PrefixEditTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:prefix="@string/bullets"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```