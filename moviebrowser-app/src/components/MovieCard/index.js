import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import './Card.css'

const MovieCard = (props) => {

  console.log(props)
    return (
        <Card className="" style={{ width: '21.5rem' }}>
          <Card.Img variant="top" src={"https://image.tmdb.org/t/p/w500/" + props.movie.poster_path} />
          <Card.Body>
            <Card.Title>{props.movie.title}</Card.Title>
            <Card.Text>
              {props.movie.genre}
            </Card.Text>
            <Button variant="primary">See Movie Description</Button>
          </Card.Body>
        </Card>
      );
}

export default MovieCard