## İçerik:
23 Nisan içeriği tekrar edildi. Farklı bir örnekle
- Nav graph
- nested graph
- pass data between destination using bundle
- global action
- pass data between destination using safe args

### Not :
- Data gönderimi:
  - Bundle ile gönderme **argümant**  veya **intent.extra**  ile alıyoruz.
  - safe args 
- Navigation Back Stack (Bu yapılarda her iki işlemde geri gidiyor.)
  - navigateUp()
    - A-> B ye giderken arkaya alıyor. burada silinen bir durum yok. Her şey üst üste bir yığın oluyor. Çok sık kullanmadığımız yığını kaldırmalıyız.

  - popBackStack()
    - Bunu kullandığımızda siliyor ve ileri gidemiyoruz. Doğal olarak silinmiş bir ekrandan. Arkada kalan her şeyi temizlemiyor sadece yığından bir adım sonrasını temizliyor.



### Dialog fragment
```Kotlin
override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Alert Dialog")
        builder.setMessage("Hello! I am Alert Dialog")
        builder.setPositiveButton("Cool", object: DialogInterface.OnClickListener {
            override fun onClick(dialog:DialogInterface, which:Int) {
                //findNavController().navigate(R.id.action_simpleDialog_to_CActivity)
                startActivity(Intent(context,CActivity::class.java))
            }
        })
        builder.setNegativeButton("Cancel", object: DialogInterface.OnClickListener {
            override fun onClick(dialog:DialogInterface, which:Int) {
                dismiss()
            }
        })
        return builder.create()
    }
    ```
