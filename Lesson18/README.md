## Kaynak:
- [picasso](https://square.github.io/picasso/)
- [glide](https://github.com/bumptech/glide)
- [retrofit](https://square.github.io/retrofit/)



```Kotlin

class MainActivity : AppCompatActivity() {
    private lateinit var avatarImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        avatarImage = findViewById(R.id.imageAvatar)

        Picasso.get().load(repoModel!!.get(0).owner.avatar_url).into(avatarImage);
        //Glide.with(this@MainActivity).load(repoModel!!.get(0).owner.avatar_url).into(avatarImage);

```



<div>
<table>
  <tr>
    <td >Picasso </td>
     <td >Glide</td>
  
 
  </tr>
  
  <tr>
    <td >
      <img src="https://user-images.githubusercontent.com/41166029/170834700-abf04c9b-a398-4581-98cf-8aecf6df620a.png" width="200" hspace="5"/>
    </td>
   <td>
  
 <img src="https://user-images.githubusercontent.com/41166029/170834707-bde2f6c8-ba98-4379-ae28-95ab67d9b540.png" width="200" hspace="5"/>
    </td>
      
  
  </tr>
 </table>
  </div>




