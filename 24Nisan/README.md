## İçerik:
23 Nisan içeriği tekrar edildi. Farklı bir örnekle


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
