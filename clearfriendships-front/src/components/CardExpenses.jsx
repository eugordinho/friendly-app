import React from "react";

function CardExpenses({ member, quantity, concept, date }) {
  return (
    <div>
      <h3>Miembro: {member}</h3>
      <p>Cantidad gastada: {quantity}</p>
      <p>Concepto: {concept}</p>
      <p>Fecha: {date}</p>
    </div>
  );
}

export default CardExpenses;
