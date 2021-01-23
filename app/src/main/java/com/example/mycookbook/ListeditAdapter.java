//package com.example.mycookbook;
//
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.content.DialogInterface;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.BaseAdapter;
//import android.widget.EditText;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import com.daimajia.swipe.SwipeLayout;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class ListViewAdapter extends BaseAdapter {
//
//    public MainActivity activity;
//    public ArrayList<Foods> data;
//
//
//    public ListViewAdapter(MainActivity context, int resource, ArrayList<Foods> data) {
////        super(context, resource, objects);
//        this.activity = context;
//        this.data = data;
//    }
//
//    @Override
//    public int getCount() {
//        return data.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder holder;
//        LayoutInflater inflater = (LayoutInflater) activity
//                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
//        // If holder not exist then locate all view from UI file.
//        if (convertView == null) {
//            // inflate UI from XML file
//            convertView = inflater.inflate(R.layout.menu_items, parent, false);
//            // get all UI view
//            holder = new ViewHolder(convertView);
//            // set tag for holder
//            convertView.setTag(holder);
//        } else {
//            // if holder created, get tag from view
//            holder = (ViewHolder) convertView.getTag();
//        }
//
//        holder.name.setText((Integer) getItem(position));
//
//        //handling buttons event
//        holder.btnEdit.setOnClickListener(onEditListener(position, holder));
//        holder.btnDelete.setOnClickListener(onDeleteListener(position, holder));
//
//        return convertView;
//    }
//
//    private View.OnClickListener onEditListener(final int position, final ViewHolder holder) {
//        return new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showEditDialog(position, holder);
//            }
//        };
//    }
//
//    /**
//     * Editting confirm dialog
//     * @param position
//     * @param holder
//     */
//    private void showEditDialog(final int position, final ViewHolder holder) {
//        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
//
//        alertDialogBuilder.setTitle("EDIT ELEMENT");
//        final EditText input = new EditText(activity);
//        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT);
//        input.setText((CharSequence) data.get(position));
//        input.setLayoutParams(lp);
//        alertDialogBuilder.setView(input);
//
//        alertDialogBuilder
//                .setCancelable(false)
//                .setPositiveButton("OK",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//
//                                Foods c = data.get(position);
//                                // get user input and set it to result edit text
//                                data.add(id,c);
//
//                                //notify data set changed
//                                activity.updateAdapter();
//                                holder.swipeLayout.close();
//                            }
//                        })
//                .setNegativeButton("Cancel",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                dialog.cancel();
//                            }
//                        });
//
//        // create alert dialog and show it
//        AlertDialog alertDialog = alertDialogBuilder.create();
//        alertDialog.show();
//    }
//
//    private View.OnClickListener onDeleteListener(final int position, final ViewHolder holder) {
//        return new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                data.remove(position);
//                holder.swipeLayout.close();
//                activity.updateAdapter();
//            }
//        };
//    }
//
////    protected static class ViewHolder {
////        public TextView name;
////        private View btnDelete;
////        public View btnEdit;
////        private SwipeLayout swipeLayout;
////
////        public ViewHolder(View v) {
////            swipeLayout = v.findViewById(R.id.swipe_layout);
////            btnDelete = v.findViewById(R.id.delete);
////            btnEdit = v.findViewById(R.id.edit_query);
////            name = v.findViewById(R.id.nam);
////
////            swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);
////        }
//    }
////}
