package hackeru.lesson.project.ui.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lhackeru/lesson/project/ui/adapter/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhackeru/lesson/project/ui/adapter/MovieAdapter$MovieItem;", "movies", "", "Lhackeru/lesson/project/entity/Movie;", "onClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieItem", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<hackeru.lesson.project.ui.adapter.MovieAdapter.MovieItem> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<hackeru.lesson.project.entity.Movie> movies = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<hackeru.lesson.project.entity.Movie, kotlin.Unit> onClick = null;
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<hackeru.lesson.project.entity.Movie> movies, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super hackeru.lesson.project.entity.Movie, kotlin.Unit> onClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<hackeru.lesson.project.entity.Movie, kotlin.Unit> getOnClick() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public hackeru.lesson.project.ui.adapter.MovieAdapter.MovieItem onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    hackeru.lesson.project.ui.adapter.MovieAdapter.MovieItem holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lhackeru/lesson/project/ui/adapter/MovieAdapter$MovieItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lhackeru/lesson/project/databinding/MovieItemBinding;", "(Lhackeru/lesson/project/databinding/MovieItemBinding;)V", "getBinding", "()Lhackeru/lesson/project/databinding/MovieItemBinding;", "app_debug"})
    public static final class MovieItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final hackeru.lesson.project.databinding.MovieItemBinding binding = null;
        
        public MovieItem(@org.jetbrains.annotations.NotNull
        hackeru.lesson.project.databinding.MovieItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final hackeru.lesson.project.databinding.MovieItemBinding getBinding() {
            return null;
        }
    }
}