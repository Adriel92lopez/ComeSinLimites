package com.example.comesinlmites.Adapter;

public class ComidaAdapter extends RecyclerView.Adapter<ComidaAdapter.ViewHolder> {

    private List<String> comidas;

    public ComidaAdapter(List<String> comidas) {
        this.comidas = comidas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_comida, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvNombre.setText(comidas.get(position));
    }

    @Override
    public int getItemCount() {
        return comidas.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre;

        ViewHolder(View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombreComida);
        }
    }
}
