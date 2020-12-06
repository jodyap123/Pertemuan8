package com.example.belajarrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.detil_dosen.*

class DetilDosen : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detil_dosen)
        if(intent.hasExtra("namanya")){
            val nama: String = this.intent.getStringExtra("namanya").toString()
            val foto: String = this.intent.getStringExtra("fotonya").toString()
            val nip: String = this.intent.getStringExtra("NIPnya").toString()
            val namaMK: String = this.intent.getStringExtra("namaMKnya").toString()
            val ruangan: String = this.intent.getStringExtra("Ruangannya").toString()
            setDetail(foto,nama, nip, namaMK, ruangan)
        }
    }
    fun setDetail(foto: String, nama:String, nip:String, namaMK:String, ruangan:String){
        val requestOp = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
        nama_detil_dosen.text = nama
        nip_detil_dosen.text = "NIP."+nip
        namaMK_detil_dosen.text = "Mata Kuliah : " +namaMK
        ruangan_detil_dosen.text = "R."+ruangan
        Glide.with(this)
            .load(foto)
            .apply(requestOp)
            .centerCrop()
            .into(foto_detil)
    }
}
