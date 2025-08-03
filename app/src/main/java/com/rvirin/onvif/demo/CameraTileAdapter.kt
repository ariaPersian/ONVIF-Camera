package com.rvirin.onvif.demo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import com.pedro.vlc.VlcListener
import com.pedro.vlc.VlcVideoLibrary
import com.rvirin.onvif.R

class CameraTileAdapter(private val items: List<CameraTile>) :
    RecyclerView.Adapter<CameraTileAdapter.TileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TileViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_camera_tile, parent, false)
        return TileViewHolder(view)
    }

    override fun onBindViewHolder(holder: TileViewHolder, position: Int) {
        val tile = items[position]
        // stop any previous playback before starting a new one
        holder.player?.stop()

        holder.player = VlcVideoLibrary(holder.itemView.context, holder, holder.texture)
        holder.player?.play(tile.rtspUrl)
    }

    override fun onViewRecycled(holder: TileViewHolder) {
        super.onViewRecycled(holder)
        holder.player?.stop()
        holder.player = null
    }

    override fun getItemCount(): Int = items.size

    class TileViewHolder(view: View) : RecyclerView.ViewHolder(view), VlcListener {
        val texture: TextureView = view.findViewById(R.id.tileTexture)
        var player: VlcVideoLibrary? = null

        override fun onComplete() {}

        override fun onError() {
            player?.stop()
        }
    }
}
