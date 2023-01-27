package com.aplikasi.tokosi03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aplikasi.tokosi03.adapter.SupplierAdapter
import com.aplikasi.tokosi03.response.supplier.Supplier

class SupplierFragment : Fragment() {

    private lateinit var supplierList: ArrayList<Supplier>
    private lateinit var supplierAdapter: SupplierAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_supplier, container, false)

        val rvSupplier = view.findViewById<RecyclerView>(R.id.rv_supplier)
        rvSupplier.setHasFixedSize(true)
        rvSupplier.layoutManager = LinearLayoutManager(activity)

        supplierList = ArrayList()

        supplierList.add(Supplier("Etek Dar"))
        supplierList.add(Supplier("Pak Donok Asongan"))
        supplierList.add(Supplier("Ibu Nurminah Barang Second"))
        supplierList.add(Supplier("Lapak Ajo Gulung"))
        supplierList.add(Supplier("Jogja Robotika"))
        supplierList.add(Supplier("Kedai Service Bang Ali"))
        supplierList.add(Supplier("Toko Afrida"))
        supplierList.add(Supplier("Yayan Gambut"))
        supplierList.add(Supplier("Elektronik Bang Ucok"))

        supplierAdapter = SupplierAdapter(supplierList)
        rvSupplier.adapter = supplierAdapter


        supplierAdapter.onItemClick = {
            val supplierNama = arguments?.getString("supplierNama")
        }

        return view
    }
}