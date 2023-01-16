package ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.tensorflow.lite.examples.detection.R;

import java.util.ArrayList;

import model.Senales;

public class SenalesAdapter extends RecyclerView.Adapter<SenalesAdapter.ViewHolder> {
    private ArrayList<Senales> mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // en este ejemplo cada elemento consta solo de un título
        public TextView txt_nombre;
        public TextView txt_codigo;
        public TextView txt_tipo;
        public TextView txt_significado;
        public ViewHolder(View v) {
            super(v);
            txt_nombre=(TextView) v.findViewById(R.id.txt_nombre);
            txt_codigo=(TextView) v.findViewById(R.id.txt_codigo);
            txt_tipo=(TextView) v.findViewById(R.id.txt_tipo);
            txt_significado=(TextView) v.findViewById(R.id.txt_significado);
        }
        public void bindData(final Senales item){
              txt_nombre.setText(item.nombre);
              txt_codigo.setText(item.codigo);
              txt_tipo.setText(item.tipo);
              txt_significado.setText(item.significado);
        }
    }

    public SenalesAdapter() {mDataSet = new ArrayList<>();}

    public void  setDataSet(ArrayList<Senales> dataSet){
        mDataSet=dataSet;
        notifyDataSetChanged();
    }

    @Override
    public SenalesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_senales, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Este método asigna valores para cada elemento de la lista
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txt_nombre.setText(mDataSet.get(position).nombre);
        holder.txt_codigo.setText(mDataSet.get(position).codigo);
        holder.txt_tipo.setText(mDataSet.get(position).tipo);
        holder.txt_significado.setText(mDataSet.get(position).significado);

    }

    // Método que define la cantidad de elementos del RecyclerView
    // Puede ser más complejo (por ejem, si implementamos filtros o búsquedas)
    @Override
    public int getItemCount() {
            return mDataSet.size();
    }
}
