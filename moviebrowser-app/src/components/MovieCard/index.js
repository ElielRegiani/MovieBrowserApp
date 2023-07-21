import Card from 'react-bootstrap/Card';
import './Card.css'
import { Link } from 'react-router-dom';

const MovieCard = (props) => {
    return (
        <Link to="/movielist">
          <Card className="card" style={{ width: '21.5rem' }}>
            <Card.Img variant="top" src={"https://image.tmdb.org/t/p/w500/" + props.movie.poster_path} />
            <Card.Body>
              <Card.Title className='title'>{props.movie.title}</Card.Title>
              <Card.Text>
                {props.movie.genre}
              </Card.Text>
            </Card.Body>
          </Card>
        </Link>
      );
}

export default MovieCard