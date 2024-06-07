import React from "react";

function CardMembers({ name, spent, totalSpent, totalMembers }) {
  return (
    <div>
      <h3>Miembro: {name}</h3>
      <p>Total gastado: {spent}</p>
      <p>Balance: {totalSpent / totalMembers - spent} </p>
    </div>
  );
}

export default CardMembers;
