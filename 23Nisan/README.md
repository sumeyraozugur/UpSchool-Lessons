## İçerik:
- Navigation Exercise:
  - Dialog Fragment 

### Sorular 
- **Activity ile Fragment arasındaki fark nedir?** 
  - Fragment daha  performanslı.
  - Fragment kullanım da geçişler, ui okuma daha hızlı.
- **Fragment ten neden activity'e geçiş yapalım ki?**
  -  Bazı kütüphanler çok complex  mecbur activityde çalışmak zorunda. Bu gibi durumlarda activitye geçiş yapıyoruz
- **Navigation kullanıyorum ,login ve register kısmını tüm uygulamamdan ayırmak istiyorum bunu nasıl yapabilirim? **
  - Nested graph sayesinde yapabiliyorum. 

  
## Notlar
```Kotlin
//Dialog Fragment
override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("This dialog title").setPositiveButton(
                "Ok",DialogInterface.OnClickListener{ dialog, id ->

                }).setNegativeButton("Cancel",DialogInterface.OnClickListener{
                    dialogInterface, i ->
            })
            builder.create()
        }?: throw  IllegalStateException("Activity cannot be null")
    }

```

`findNavController().navigate(R.id.action_AFragment_to_loginActivity)` yerine intentte kullanabilirsin şu şekilde
`startActivity(Intent(context, LoginActivity::class.java))`

