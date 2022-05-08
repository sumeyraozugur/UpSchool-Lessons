# Life Cycle
## Activity Nedir?
Activity ler yığına dizilecek şekilde açılıyor. Her activity açtığınızda arka tarafa bir yığın oluşuyor. Fragment bir activity içinde açıldığı için fragment kullanımına önem gösteriyoruz.

```Kotlin
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.v("AKBANK", "onCreate Called")


    }

    override fun onStart() {
        super.onStart()
        //Log.v("AKBANK", "onStart Called")


    }

    override fun onPause() {
        super.onPause()
        //Log.v("AKBANK", "onPause Called")
    }

    override fun onResume() {
        super.onResume()
        //Log.v("AKBANK", "onResume Called")
    }

    override fun onStop() {
        super.onStop()
        //Log.v("AKBANK", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        //Log.v("AKBANK", "onDestroy Called")
    }


```
