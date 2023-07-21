import MovieCard from './../MovieCard'
import './MovieLine.css'

const MovieLine = (props) => {

    if (!props.movies || props.movies.length === 0) {
        return "";
    }

    return (
        <div className='movieline'>
            {props.movies.map((movie) => (
                <MovieCard key={movie.id} movie={movie} />
            ))}
        </div>
    )
}

export default MovieLine