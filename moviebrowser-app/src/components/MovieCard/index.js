import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import './Card.css'

const MovieCard = (props) => {
    return (
        <Card style={{ width: '18rem' }}>
          
          <Card.Img variant="top" src="https://github.com/ElielRegiani.png" />
          <Card.Body>
            <Card.Title>{props.movieName}</Card.Title>
            <Card.Text>
              {props.genre}
            </Card.Text>
            <Button variant="primary">See Description</Button>
          </Card.Body>
        </Card>
      );
}

export default MovieCard